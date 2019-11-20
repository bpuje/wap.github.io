package edu.mum.shared.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class EaUtils {

	public static <T> List<T> iterableToCollection(Iterable<T> iterable) {
		List<T> collection = new ArrayList<>();
		iterable.forEach(collection::add);
		return collection;
	}

	public static boolean isServiceAuthorized(HttpServletRequest request, String serviceSecret){
		return request.getHeader("service-secret").equals(serviceSecret);
	}

}
