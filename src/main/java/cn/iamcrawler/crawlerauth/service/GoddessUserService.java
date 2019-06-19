package cn.iamcrawler.crawlerauth.service;

import cn.iamcrawler.crawler_common.domain.goddess.GoddessUser;
import cn.iamcrawler.crawlerauth.mapper.GoddessUserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuliang
 * on 2019/6/18
 */
@Service
public class GoddessUserService extends ServiceImpl<GoddessUserMapper, GoddessUser> {

    @Resource
    GoddessUserMapper userMapper;


    public Boolean updatePassword(String userName){

        GoddessUser user = userMapper.selectOne(new QueryWrapper<GoddessUser>().eq("user_name", userName));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword().trim()));
        int i = userMapper.updateById(user);
        return i!=0;
    }


}
