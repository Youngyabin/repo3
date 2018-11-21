package cn.itcast.service.impl;

import cn.itcast.service.ItemsService;
import com.sun.tools.javac.jvm.Items;
@Service
public class ItemsServiceImpl implements ItemsService {
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
