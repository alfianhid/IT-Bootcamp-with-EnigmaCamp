import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:to_do_list_app/data/model/member.dart';
import 'package:to_do_list_app/presentation/member/member_view_model.dart';

class MemberListScreen extends StatefulWidget {
  MemberViewModel memberViewModel = MemberViewModel();

  @override
  _MemberListScreenState createState() => _MemberListScreenState();
}

class _MemberListScreenState extends State<MemberListScreen> {
  List<dynamic> listMember = <Member>[];

  @override
  void initState() {
    super.initState();
    _getListMember();
  }

  _deleteMember(int id, int status) async {
    setState(() {
      print(id);
      widget.memberViewModel.deleteMember(id, status);
    });
    Navigator.pop(context);
  }

  _getListMember() async {
    listMember = await widget.memberViewModel.getMember();
    Future.delayed(const Duration(microseconds: 100), () {
      setState(() {
        listMember = listMember;
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        child: Column(
          children: [
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.only(left: 140.0),
                  child: ElevatedButton(
                    onPressed: () {
                      final status =
                          Navigator.pushNamed(context, '/member/add');
                      if (status == 'Submitted') {
                        setState(() {
                          _getListMember();
                        });
                      }
                    },
                    child: Text('Add Member'),
                  ),
                ),
              ],
            ),
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.only(left: 110.0),
                  child: Text(
                    'Member List',
                    style:
                        TextStyle(fontSize: 30.0, fontWeight: FontWeight.bold),
                  ),
                ),
              ],
            ),
            Expanded(
                child: Card(
              child: Scrollbar(
                  child: ListView.builder(
                itemBuilder: (context, index) {
                  return Column(
                    children: [
                      Row(
                        children: [
                          Expanded(
                              child: ListTile(
                            leading: Icon(Icons.perm_identity, size: 40.0),
                            title: Text(listMember[index].firstName +
                                ' ' +
                                listMember[index].lastName),
                          )),
                          Expanded(
                              child: Padding(
                            padding: const EdgeInsets.only(left: 90.0),
                            child: ListTile(
                                leading: Icon(
                                  Icons.delete,
                                  color: Colors.red,
                                ),
                                onTap: () => showDialog(
                                      context: context,
                                      builder: (context) {
                                        return AlertDialog(
                                          title: Text('Delete Confirmation'),
                                          content: Text(
                                              'Are you sure to delete this member?'),
                                          actions: <Widget>[
                                            ElevatedButton(
                                                onPressed: () {
                                                  _deleteMember(
                                                      listMember[index].id,
                                                      listMember[index].status);
                                                },
                                                child: Text('Yes')),
                                            ElevatedButton(
                                                onPressed: () {
                                                  Navigator.pop(context);
                                                },
                                                child: Text('No')),
                                          ],
                                        );
                                      },
                                    )),
                          ))
                        ],
                      ),
                    ],
                  );
                },
                itemCount: listMember.length,
              )),
            )),
          ],
        ),
      ),
    );
  }
}
