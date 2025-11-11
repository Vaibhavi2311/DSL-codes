import java.util.Arrays;
import java.util.Scanner;

class HashTableLinearProbing {
    private int[] table;
    private int size;

    public HashTableLinearProbing(int size) {
        this.size = size;
        table = new int[size];
        Arrays.fill(table, -1);  // -1 means empty slot
    }

    private int hashKey(int key) {
        return key % size;
    }

    // Insert with linear probing
    public void insert(int key) {
        int index = hashKey(key);

        if (table[index] == -1) {
            table[index] = key;
            System.out.println("Inserted key " + key + " at index " + index);
        } else {
            int start = index;
            do {
                index = (index + 1) % size;
            } while (table[index] != -1 && index != start);

            if (table[index] == -1) {
                table[index] = key;
                System.out.println("Inserted key " + key + " at index " + index + " (after collision)");
            } else {
                System.out.println("Hash table is full. Cannot insert key " + key);
            }
        }
    }

    // Search for a key
    public boolean search(int key) {
        int index = hashKey(key);
        int start = index;

        while (table[index] != -1) {
            if (table[index] == key) {
                System.out.println("Key " + key + " found at index " + index);
                return true;
            }
            index = (index + 1) % size;
            if (index == start)
                break;
        }
        System.out.println("Key " + key + " not found.");
        return false;
    }

    // Delete a key
    public boolean delete(int key) {
        int index = hashKey(key);
        int start = index;

        while (table[index] != -1) {
            if (table[index] == key) {
                table[index] = -1;
                System.out.println("Key " + key + " deleted from index " + index);
                return true;
            }
            index = (index + 1) % size;
            if (index == start)
                break;
        }
        System.out.println("Key " + key + " not found for deletion.");
        return false;
    }

    // Display table
    public void display() {
        System.out.println("\nIndex\tKey");
        for (int i = 0; i < size; i++) {
            if (table[i] != -1)
                System.out.println(i + "\t" + table[i]);
            else
                System.out.println(i + "\tEmpty");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of hash table: ");
        int size = sc.nextInt();

        HashTableLinearProbing ht = new HashTableLinearProbing(size);

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    int key = sc.nextInt();
                    ht.insert(key);
                    break;

                case 2:
                    System.out.print("Enter key to search: ");
                    int s = sc.nextInt();
                    ht.search(s);
                    break;

                case 3:
                    System.out.print("Enter key to delete: ");
                    int d = sc.nextInt();
                    ht.delete(d);
                    break;

                case 4:
                    ht.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

