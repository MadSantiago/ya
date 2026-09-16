package p000;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ۥؘْؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1489 f1493 = new C1489(1);

    /* JADX INFO: renamed from: ۥۗ */
    public static final Map f1492 = AbstractC4554.m7919(new C3869("boolean", Boolean.TYPE), new C3869("byte", Byte.TYPE), new C3869("char", Character.TYPE), new C3869("short", Short.TYPE), new C3869("int", Integer.TYPE), new C3869("long", Long.TYPE), new C3869("float", Float.TYPE), new C3869("double", Double.TYPE), new C3869("void", Void.TYPE));

    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: ۥۗ */
    public static Serializable m918(ClassLoader classLoader, ArrayList arrayList) {
        Object c4535;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                c4535 = m919(classLoader, (String) it.next());
            } catch (Throwable th) {
                c4535 = new C4535(th);
            }
            Throwable thM405 = AbstractC0183.m405(c4535);
            if (thM405 != null) {
                return new C4535(thM405);
            }
            arrayList2.add((Class) c4535);
        }
        return arrayList2.toArray(new Class[0]);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[PHI: r3
  0x003a: PHI (r3v29 java.lang.Object) = (r3v41 java.lang.Object), (r3v42 java.lang.Object) binds: [B:24:0x0054, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x008b A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de A[Catch: all -> 0x0074, LOOP:0: B:51:0x00d6->B:53:0x00de, LOOP_END, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[Catch: all -> 0x0074, LOOP:1: B:58:0x00fb->B:59:0x00fd, LOOP_END, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX INFO: renamed from: ۥۣ */
    public static Class m919(ClassLoader classLoader, String str) {
        C3997 c3997;
        Object objM7137;
        WeakHashMap weakHashMap;
        Map map;
        C3997 c3998;
        String strSubstring;
        int i;
        Class<?> clsLoadClass;
        int i2;
        Class<?> cls;
        Object objM7138;
        Object map2;
        WeakReference weakReference;
        ClassLoader classLoader2;
        Object obj;
        Object obj2;
        C3997 c3999;
        Object objM7139;
        C1489 c1489 = f1493;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c1489.f5059;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            WeakHashMap weakHashMap2 = (WeakHashMap) c1489.f5056;
            if (weakHashMap2 == null) {
                WeakReference weakReference2 = (WeakReference) c1489.f5057;
                if ((weakReference2 != null ? (ClassLoader) weakReference2.get() : null) != classLoader || (c3999 = (C3997) ((HashMap) c1489.f5058).get(str)) == null || (objM7139 = c3999.m7137()) == null) {
                    obj2 = objM7137;
                    obj2 = objM7139;
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        weakHashMap = (WeakHashMap) c1489.f5056;
                        if (weakHashMap == null) {
                            weakReference = (WeakReference) c1489.f5057;
                            if (weakReference != null) {
                                classLoader2 = (ClassLoader) weakReference.get();
                            } else {
                                classLoader2 = null;
                            }
                            if (classLoader2 == null) {
                                c1489.f5057 = new WeakReference(classLoader);
                                ((HashMap) c1489.f5058).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap = new WeakHashMap();
                                weakHashMap.put(classLoader2, (HashMap) c1489.f5058);
                                weakHashMap.put(classLoader, new HashMap());
                                c1489.f5056 = weakHashMap;
                                c1489.f5057 = null;
                                c1489.f5058 = new HashMap();
                            }
                        }
                        if (weakHashMap != null) {
                            map2 = weakHashMap.get(classLoader);
                            if (map2 == null) {
                                map2 = new HashMap();
                                weakHashMap.put(classLoader, map2);
                            }
                            map = (Map) map2;
                        } else {
                            map = (HashMap) c1489.f5058;
                        }
                        c3998 = (C3997) map.get(str);
                        if (c3998 != null || (objM7138 = c3998.m7137()) == null) {
                            Object obj3 = objM7138;
                            strSubstring = str;
                            i = 0;
                            while (strSubstring.endsWith("[]")) {
                                i++;
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                            }
                            clsLoadClass = (Class) f1492.get(strSubstring);
                            if (clsLoadClass == null) {
                                clsLoadClass = classLoader.loadClass(strSubstring);
                            }
                            i2 = 0;
                            cls = clsLoadClass;
                            while (i2 < i) {
                                i2++;
                                cls = Array.newInstance(cls, 0).getClass();
                            }
                            map.put(str, new C3997(cls));
                            obj3 = cls;
                        }
                    } finally {
                        writeLock.unlock();
                    }
                } else {
                    obj2 = objM7137;
                    obj2 = objM7139;
                    lock.unlock();
                    obj = obj2;
                }
            } else {
                Map map3 = (Map) weakHashMap2.get(classLoader);
                if (map3 == null || (c3997 = (C3997) map3.get(str)) == null || (objM7137 = c3997.m7137()) == null) {
                    obj2 = objM7137;
                    obj2 = objM7139;
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
                    writeLock2.lock();
                    weakHashMap = (WeakHashMap) c1489.f5056;
                    if (weakHashMap == null) {
                        weakReference = (WeakReference) c1489.f5057;
                        if (weakReference != null) {
                            classLoader2 = (ClassLoader) weakReference.get();
                        } else {
                            classLoader2 = null;
                        }
                        if (classLoader2 == null) {
                            c1489.f5057 = new WeakReference(classLoader);
                            ((HashMap) c1489.f5058).clear();
                        } else if (classLoader2 != classLoader) {
                            weakHashMap = new WeakHashMap();
                            weakHashMap.put(classLoader2, (HashMap) c1489.f5058);
                            weakHashMap.put(classLoader, new HashMap());
                            c1489.f5056 = weakHashMap;
                            c1489.f5057 = null;
                            c1489.f5058 = new HashMap();
                        }
                    }
                    if (weakHashMap != null) {
                        map2 = weakHashMap.get(classLoader);
                        if (map2 == null) {
                            map2 = new HashMap();
                            weakHashMap.put(classLoader, map2);
                        }
                        map = (Map) map2;
                    } else {
                        map = (HashMap) c1489.f5058;
                    }
                    c3998 = (C3997) map.get(str);
                    if (c3998 != null) {
                        Object obj4 = objM7138;
                        strSubstring = str;
                        i = 0;
                        while (strSubstring.endsWith("[]")) {
                            i++;
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        clsLoadClass = (Class) f1492.get(strSubstring);
                        if (clsLoadClass == null) {
                            clsLoadClass = classLoader.loadClass(strSubstring);
                        }
                        i2 = 0;
                        cls = clsLoadClass;
                        while (i2 < i) {
                            i2++;
                            cls = Array.newInstance(cls, 0).getClass();
                        }
                        map.put(str, new C3997(cls));
                        obj4 = cls;
                    } else {
                        Object obj5 = objM7138;
                        strSubstring = str;
                        i = 0;
                        while (strSubstring.endsWith("[]")) {
                            i++;
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        clsLoadClass = (Class) f1492.get(strSubstring);
                        if (clsLoadClass == null) {
                            clsLoadClass = classLoader.loadClass(strSubstring);
                        }
                        i2 = 0;
                        cls = clsLoadClass;
                        while (i2 < i) {
                            i2++;
                            cls = Array.newInstance(cls, 0).getClass();
                        }
                        map.put(str, new C3997(cls));
                        obj5 = cls;
                    }
                } else {
                    obj2 = objM7137;
                    obj2 = objM7139;
                    lock.unlock();
                    obj = obj2;
                }
            }
            return (Class) obj;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
