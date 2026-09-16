package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۥۗؑٛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2094 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3223 f6888;

    /* JADX INFO: renamed from: ۥُ */
    public int f6889;

    /* JADX INFO: renamed from: ۥّ */
    public int f6890;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0697 f6891;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6892;

    /* JADX INFO: renamed from: ۦؑ */
    public int f6893;

    public C2094(int i) {
        this.f6892 = i;
        if (i <= 0) {
            AbstractC2552.m4814("maxSize <= 0");
            throw null;
        }
        this.f6891 = new C0697(1);
        this.f6888 = new C3223(16);
    }

    public final String toString() {
        String str;
        synchronized (this.f6888) {
            try {
                int i = this.f6889;
                int i2 = this.f6890 + i;
                str = "LruCache[maxSize=" + this.f6892 + ",hits=" + this.f6889 + ",misses=" + this.f6890 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m4035(Object obj) {
        Object objPut;
        synchronized (this.f6888) {
            Object obj2 = this.f6891.f2527.get(obj);
            if (obj2 != null) {
                this.f6889++;
                return obj2;
            }
            this.f6890++;
            Object objMo4040 = mo4040(obj);
            if (objMo4040 == null) {
                return null;
            }
            synchronized (this.f6888) {
                try {
                    objPut = this.f6891.f2527.put(obj, objMo4040);
                    if (objPut != null) {
                        this.f6891.f2527.put(obj, objPut);
                    } else {
                        this.f6893 += m4037(obj, objMo4040);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                mo4038(obj, objMo4040, objPut);
                return objPut;
            }
            m4039(this.f6892);
            return objMo4040;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Object m4036(Object obj) {
        Object objRemove;
        synchronized (this.f6888) {
            objRemove = this.f6891.f2527.remove(obj);
            if (objRemove != null) {
                this.f6893 -= m4037(obj, objRemove);
            }
        }
        if (objRemove != null) {
            mo4038(obj, objRemove, null);
        }
        return objRemove;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final int m4037(Object obj, Object obj2) {
        int iMo4042 = mo4042(obj, obj2);
        if (iMo4042 >= 0) {
            return iMo4042;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m4039(int i) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f6888) {
                try {
                    if (this.f6893 < 0 || (this.f6891.f2527.isEmpty() && this.f6893 != 0)) {
                        break;
                    }
                    if (this.f6893 > i && !this.f6891.f2527.isEmpty()) {
                        Set setEntrySet = this.f6891.f2527.entrySet();
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f6891.f2527.remove(key);
                        this.f6893 -= m4037(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mo4038(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public Object mo4040(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m4041(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f6888) {
            this.f6893 += m4037(obj, obj2);
            objPut = this.f6891.f2527.put(obj, obj2);
            if (objPut != null) {
                this.f6893 -= m4037(obj, objPut);
            }
        }
        if (objPut != null) {
            mo4038(obj, objPut, obj2);
        }
        m4039(this.f6892);
        return objPut;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public int mo4042(Object obj, Object obj2) {
        return 1;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo4038(Object obj, Object obj2, Object obj3) {
    }
}
