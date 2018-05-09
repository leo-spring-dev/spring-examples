private <T> T annotations(Annotation[] annotations, Class<T> annotationType) throws InstantiationException, IllegalAccessException {
		T a = annotationType.newInstance();
		
		Annotation instance = null;
		
		for(Annotation ann : annotations) {
			if(annotationType.isInstance(ann)) {
				instance = ann;
			}
		}
		return a;
	}
