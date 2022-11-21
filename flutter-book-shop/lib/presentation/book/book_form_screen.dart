import 'package:flutter/material.dart';
import 'package:form_field_validator/form_field_validator.dart';
import 'package:to_do_list_app/data/model/book.dart';
import 'package:to_do_list_app/presentation/book/book_view_model.dart';
import 'package:to_do_list_app/widgets/text_field_widget.dart';

class BookFormScreen extends StatefulWidget {
  //const BookFormScreen({Key? key}) : super(key: key);
  BookViewModel bookViewModel = BookViewModel();

  @override
  _BookFormScreenState createState() => _BookFormScreenState();
}

class _BookFormScreenState extends State<BookFormScreen> {
  final GlobalKey<FormState> _formKey = GlobalKey<FormState>();
  TextEditingController title = new TextEditingController();
  TextEditingController description = new TextEditingController();
  TextEditingController year = new TextEditingController();
  TextEditingController pages = new TextEditingController();
  TextEditingController language = new TextEditingController();
  TextEditingController publisher = new TextEditingController();
  TextEditingController price = new TextEditingController();
  TextEditingController stock = new TextEditingController();

  submitBook() {
    setState(() {
      int int_year = int.parse(year.text);
      int int_pages = int.parse(pages.text);
      int int_price = int.parse(price.text);
      int int_stock = int.parse(stock.text);
      widget.bookViewModel.addBook(Book(
          title: title.text,
          description: description.text,
          year: int_year,
          pages: int_pages,
          language: language.text,
          publisher: publisher.text,
          price: int_price,
          stock: int_stock));
    });
  }

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {
        FocusScopeNode currentFocus = FocusScope.of(context);
        if (!currentFocus.hasPrimaryFocus) {
          currentFocus.unfocus();
        }
      },
      child: Scaffold(
          appBar: AppBar(
            title: Center(child: Text('Book Form')),
          ),
          resizeToAvoidBottomInset: false,
          body: Column(
            children: [
              Form(
                  key: _formKey,
                  child: Column(
                    children: [
                      TextFieldWidget(
                        tec: title,
                        hintText: 'Enter your book title',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book title is required!'),
                          MinLengthValidator(2,
                              errorText: 'Minimum is 2 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: description,
                        hintText: 'Enter your book description',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book description is required!'),
                          MinLengthValidator(5,
                              errorText: 'Minimum is 5 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: year,
                        hintText: 'Enter your book year',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book year is required!'),
                          MinLengthValidator(4,
                              errorText: 'Minimum is 4 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: pages,
                        hintText: 'Enter your book pages',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book pages is required!'),
                          MinLengthValidator(2,
                              errorText: 'Minimum is 2 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: language,
                        hintText: 'Enter your book language',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book language is required!'),
                          MinLengthValidator(5,
                              errorText: 'Minimum is 5 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: publisher,
                        hintText: 'Enter your book publisher',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book publisher is required!'),
                          MinLengthValidator(2,
                              errorText: 'Minimum is 2 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: price,
                        hintText: 'Enter your book price',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book price is required!'),
                          MinLengthValidator(4,
                              errorText: 'Minimum is 4 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: stock,
                        hintText: 'Enter your book stock',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Book stock is required!'),
                          MinLengthValidator(1,
                              errorText: 'Minimum is 1 characters'),
                        ]),
                      ),
                    ],
                  )),
              Padding(
                padding: const EdgeInsets.all(10.0),
                child: ElevatedButton(
                    onPressed: () {
                      if (_formKey.currentState!.validate()) {
                        submitBook();
                      }
                      Navigator.pop(context, 'Submitted');
                    },
                    child: const Text('Submit')),
              ),
            ],
          )),
    );
  }
}
