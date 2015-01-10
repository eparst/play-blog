package controllers;

import db.BlogDao;
import model.Post;
import play.*;
import play.api.libs.Collections;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(BlogDao.getAllPosts()));
    }

    public static Result detailpost(String id) {
        return ok(detailpost.render(BlogDao.getPostById(id)));
    }

}
