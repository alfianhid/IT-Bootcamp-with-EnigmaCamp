import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:form_field_validator/form_field_validator.dart';
import 'package:to_do_list_app/to_do_detail.dart';
import 'package:to_do_list_app/widgets/text_field_widget.dart';

class ToDoScreen extends StatefulWidget {
  const ToDoScreen({Key? key}) : super(key: key);

  @override
  _ToDoScreenState createState() => _ToDoScreenState();
}

class ToDoModel {
  int id;
  String toDoNames;
  String toDoDescs;
  String toDoTimes;

  ToDoModel(this.id, this.toDoNames, this.toDoDescs, this.toDoTimes);
}

class _ToDoScreenState extends State<ToDoScreen> {
  List<ToDoModel> todos = <ToDoModel>[];
  final GlobalKey<FormState> _formKey = GlobalKey<FormState>();
  TextEditingController toDoName = new TextEditingController();
  TextEditingController toDoDesc = new TextEditingController();
  TextEditingController toDoTime = new TextEditingController();

  addToDo() {
    setState(() {
      todos.add(new ToDoModel(
          todos.length + 1, toDoName.text, toDoDesc.text, toDoTime.text));
    });
  }

  deleteToDo(int id) {
    setState(() {
      todos.removeAt(id);
    });
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(
          title: const Text('To Do App'),
        ),
        body: Container(
          child: Column(
            children: [
              Padding(
                  padding: const EdgeInsets.all(12.0),
                  child: Form(
                    key: _formKey,
                    child: Column(
                      children: [
                        TextFieldWidget(
                          tec: toDoName,
                          hintText: 'Enter your to do',
                          validate: MultiValidator([
                            RequiredValidator(errorText: 'To do is required!'),
                            MinLengthValidator(5,
                                errorText: 'Minimum is 5 characters'),
                          ]),
                        ),
                        Padding(
                          padding: const EdgeInsets.all(24.0),
                          child: ElevatedButton(
                              onPressed: () {
                                if (_formKey.currentState!.validate()) {
                                  addToDo();
                                }
                              },
                              child: const Text('Submit')),
                        ),
                      ],
                    ),
                  )),
              Expanded(
                  child: Scrollbar(
                      child: ListView.builder(
                itemBuilder: (context, index) {
                  return Column(
                    children: [
                      Row(
                        children: [
                          Expanded(
                              child: ListTile(
                            onTap: () {
                              //Navigator.pushNamed(context, '/detail');
                              Navigator.push(
                                  context,
                                  MaterialPageRoute(
                                      builder: (context) => ToDoDetail()));
                            },
                            leading: Icon(Icons.access_alarm),
                            title: Text(
                              todos[index].toDoNames,
                              style: TextStyle(fontWeight: FontWeight.bold),
                            ),
                          )),
                          Expanded(
                              child: ListTile(
                            hoverColor: Colors.red,
                            leading: Padding(
                              padding: const EdgeInsets.only(left: 100.0),
                              child: Icon(Icons.delete),
                            ),
                            onTap: () => deleteToDo(index),
                          ))
                        ],
                      ),
                      Divider(
                        height: 5.0,
                        color: Colors.blue,
                      )
                    ],
                  );
                },
                itemCount: todos.length,
              )))
              // Padding(
              //   padding: const EdgeInsets.all(8.0),
              //   child: Column(
              //     children: todos.map((element) => new Text(element)).toList(),
              //   ),
              // )
            ],
          ),
        ),
      ),
    );
  }
}
