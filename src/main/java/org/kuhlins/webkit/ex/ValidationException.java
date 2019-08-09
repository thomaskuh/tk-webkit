package org.kuhlins.webkit.ex;

public class ValidationException extends ClientException {

  private static final long serialVersionUID = 1L;

  public static final String DEFAULT_KEY = "VALIDATION";

  public ValidationException() {
    super(DEFAULT_KEY);
  }

  public ValidationException(String key) {
    super(key);
  }

  @Override
  public int getHttpCode() {
    return 400;
  }

}
