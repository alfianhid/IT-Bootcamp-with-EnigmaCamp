import 'package:to_do_list_app/data/model/member.dart';
import 'package:to_do_list_app/data/repository/member_repo.dart';

class MemberViewModel {
  MemberRepo _memberRepo = MemberRepo();

  addMember(Member newMember) async {
    final newMemberSubmit = await _memberRepo.addProduct(newMember);
    print(newMemberSubmit);
  }

  Future<List<dynamic>> getMember() async {
    final getListMember = await _memberRepo.getProduct();
    return getListMember;
  }

  deleteMember(int id, int status) async {
    final deleted = await _memberRepo.deleteProduct(id, status);
    print(deleted);
  }
}
