package org.jeevaashraya.android.util;

import com.pkmmte.pkrss.Category;
import java.util.List;

import org.jeevaashraya.android.model.Author;

public class Constants {
	public static final String PREFS_NAME = "Jeev Aashraya";
	public static final String PREF_READ = "MARK READ";

	public static final String WEBSITE_URL = "http://www.jeevaashraya.org";
	public static final String CATEGORY_URL = WEBSITE_URL + "/category";
	public static final String MAIN_FEED = WEBSITE_URL + "/feed";
	public static final String PKRSS_URL = "http://www.insanedevelopers.com";
	//public static final String DEV_URL = "http://insanedevelopers.com";

	public static final List<Category> CATEGORIES = new Category.ListBuilder().add("Rescues", MAIN_FEED).build();
	public static final Category DEFAULT_CATEGORY = CATEGORIES.get(0);

	public static final List<Author> AUTHORS = new Author.ListBuilder().build();
}