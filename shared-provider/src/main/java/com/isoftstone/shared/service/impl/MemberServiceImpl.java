package com.isoftstone.shared.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isoftstone.shared.core.model.Member;
import com.isoftstone.shared.core.page.Page;
import com.isoftstone.shared.core.service.IMemberService;
import com.isoftstone.shared.dao.MemberDao;

@Service("memberService")
public class MemberServiceImpl implements IMemberService {
	@Resource(name = "memberDao")
	private MemberDao memberDao;

	@Transactional
	public int add(Member member) {
		if (member == null) {
			throw new IllegalArgumentException("member is null");
		}else if (member.getUname() == null) {
			throw new IllegalArgumentException("member' uname is null");
		}else if (member.getPassword() == null) {
			throw new IllegalArgumentException("member' password is null");
		}
		if (this.checkname(member.getUname()) == 1) {
			return 0;
		}
		return 1;
	}

	public Member checkEmail(String checkStr) {
		// TODO Auto-generated method stub
		return null;
	}

	public int checkname(String name) {
		int count = this.checkname(name);
		count = count > 0 ? 1 : 0;
		return count;
	}

	public Member edit(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	public Member get(Integer member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page list(String order, int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page list(String order, String name, String uname, int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public Member getMemberByUname(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePassword(String password) {
		// TODO Auto-generated method stub
		
	}

	public void updatePassword(Integer memberid, String password) {
		// TODO Auto-generated method stub
		
	}

	public void addMoney(Integer memberid, Double num) {
		// TODO Auto-generated method stub
		
	}

	public void cutMoney(Integer memberid, Double num) {
		// TODO Auto-generated method stub
		
	}

	public int login(String username, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public int loginbysys(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateLv(int memberid, int lvid) {
		// TODO Auto-generated method stub
		
	}

}
