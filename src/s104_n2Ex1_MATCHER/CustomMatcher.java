package s104_n2Ex1_MATCHER;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class CustomMatcher extends FeatureMatcher {

  public CustomMatcher(Matcher subMatcher) { 
    super();
  }
 protected Integer featureValueOf(String actual) { 
    return actual.length();
  }
}

