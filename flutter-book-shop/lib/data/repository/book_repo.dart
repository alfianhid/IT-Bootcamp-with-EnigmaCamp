import 'package:to_do_list_app/data/api/api_helper.dart';
import 'package:to_do_list_app/data/model/book.dart';
import 'package:to_do_list_app/data/model/book_response.dart';

class BookRepo {
  final ApiHelper _apiHelper = ApiHelper.INSTANCE;

  Future<Book> addProduct(Book newBook) async {
    final response = await _apiHelper.postData('/book/add', newBook.toMap());
    return Book.fromMap(response);
  }

  Future<List<dynamic>> getProduct() async {
    final response = await _apiHelper.getData('/book');
    return BookResponse.fromList(response).books;
  }
}
