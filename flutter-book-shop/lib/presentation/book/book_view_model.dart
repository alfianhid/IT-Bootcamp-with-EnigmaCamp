import 'package:to_do_list_app/data/model/book.dart';
import 'package:to_do_list_app/data/repository/book_repo.dart';

class BookViewModel {
  BookRepo _bookRepo = BookRepo();

  addBook(Book newBook) async {
    print('BookViewModel di sini.');
    print(newBook);
    final newBookSubmit = await _bookRepo.addProduct(newBook);
    print(newBookSubmit);
  }

  Future<List<dynamic>> getBook() async {
    final getListBook = await _bookRepo.getProduct();
    return getListBook;
  }
}
