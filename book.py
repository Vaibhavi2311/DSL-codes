details={
    'p1':['c','c++','java'],
    'p2':['python','js','c'],
    'p3':['html','java','c','python'],
    'p4':[],
    'p5':['c++']
}
total_members=len(details)
print(total_members)
total_books=sum(len(books) for books in details.values())
print(total_books)
avg=total_books/total_members
print('the avg number of books',avg)
zero_members=sum(1 for books in details.values() if len(books)==0)
print(zero_members)
all_books=[]
for books in details.values():
    all_books.extend(books)
book_count={}
for book in all_books:
    if book in book_count:
        book_count[book]+=1
    else:
        book_count[book]=1
print(book_count)

most_borrowed=""
max_count=0
for book in book_count:
    if book_count[book]>max_count:
        max_count=book_count[book]
        most_borrowed=book
print(most_borrowed,"is the most borrowed i.e. taken",max_count,"times")

least=min(book_count,key=book_count.get)
least_count=book_count[least]
print(least,"is the least borrowed",least_count,"times")
borrow_counts = [len(books) for books in details.values()]
mode = max(set(borrow_counts), key=borrow_counts.count)
print("Most frequent borrow count (mode):", mode)
    