package org.csu.mypetstore.persistence;

import org.csu.mypetstore.domain.Mylog;

import java.util.List;

public interface MylogMapper {
    List<Mylog> getMylogList();

    Mylog getMylog(String username);
}
