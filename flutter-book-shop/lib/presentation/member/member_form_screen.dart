import 'package:flutter/material.dart';
import 'package:form_field_validator/form_field_validator.dart';
import 'package:to_do_list_app/data/model/member.dart';
import 'package:to_do_list_app/presentation/member/member_view_model.dart';
import 'package:to_do_list_app/widgets/text_field_password.dart';
import 'package:to_do_list_app/widgets/text_field_widget.dart';

class MemberFormScreen extends StatefulWidget {
  //const BookFormScreen({Key? key}) : super(key: key);
  MemberViewModel memberViewModel = MemberViewModel();

  @override
  _MemberFormScreenState createState() => _MemberFormScreenState();
}

class _MemberFormScreenState extends State<MemberFormScreen> {
  final GlobalKey<FormState> _formKey = GlobalKey<FormState>();
  TextEditingController firstName = new TextEditingController();
  TextEditingController lastName = new TextEditingController();
  TextEditingController email = new TextEditingController();
  TextEditingController password = new TextEditingController();
  TextEditingController status = new TextEditingController();

  submitMember() {
    setState(() {
      int int_status = int.parse(status.text);
      widget.memberViewModel.addMember(Member(
          firstName: firstName.text,
          lastName: lastName.text,
          email: email.text,
          password: password.text,
          status: int_status));
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
            title: Center(child: Text('Member Form')),
          ),
          resizeToAvoidBottomInset: false,
          body: Column(
            children: [
              Form(
                  key: _formKey,
                  child: Column(
                    children: [
                      TextFieldWidget(
                        tec: firstName,
                        hintText: 'Enter your first name',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'First name is required!'),
                          MinLengthValidator(2,
                              errorText: 'Minimum is 2 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: lastName,
                        hintText: 'Enter your last name',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Last name is required!'),
                          MinLengthValidator(2,
                              errorText: 'Minimum is 2 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: email,
                        hintText: 'Enter your email',
                        validate: MultiValidator([
                          RequiredValidator(errorText: 'Email is required!'),
                          MinLengthValidator(8,
                              errorText: 'Minimum is 8 characters'),
                        ]),
                      ),
                      TextFieldPassword(
                        tec: password,
                        hintText: 'Enter your password',
                        validate: MultiValidator([
                          RequiredValidator(errorText: 'Password is required!'),
                          MinLengthValidator(8,
                              errorText: 'Minimum is 8 characters'),
                        ]),
                      ),
                      TextFieldWidget(
                        tec: status,
                        hintText: 'Enter your member status (0 or 1)',
                        validate: MultiValidator([
                          RequiredValidator(
                              errorText: 'Member status is required!'),
                          MaxLengthValidator(1,
                              errorText: 'Maximum is 1 character'),
                        ]),
                      ),
                    ],
                  )),
              Padding(
                padding: const EdgeInsets.all(10.0),
                child: ElevatedButton(
                    onPressed: () {
                      if (_formKey.currentState!.validate()) {
                        submitMember();
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
