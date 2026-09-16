package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٍَؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0941 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2763 f3340 = new C2763();

    /* JADX INFO: renamed from: ۥؗ */
    public final AutoCloseable m1914(String str) {
        AutoCloseable autoCloseable;
        C2763 c2763 = this.f3340;
        synchronized (c2763.f9147) {
            autoCloseable = (AutoCloseable) c2763.f9146.get(str);
        }
        return autoCloseable;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1915() {
        C2763 c2763 = this.f3340;
        if (!c2763.f9148) {
            c2763.f9148 = true;
            synchronized (c2763.f9147) {
                try {
                    Iterator it = c2763.f9146.values().iterator();
                    while (it.hasNext()) {
                        C2763.m5116((AutoCloseable) it.next());
                    }
                    Iterator it2 = c2763.f9145.iterator();
                    while (it2.hasNext()) {
                        C2763.m5116((AutoCloseable) it2.next());
                    }
                    c2763.f9145.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo768();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1916(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C2763 c2763 = this.f3340;
        if (c2763.f9148) {
            C2763.m5116(autoCloseable);
            return;
        }
        synchronized (c2763.f9147) {
            autoCloseable2 = (AutoCloseable) c2763.f9146.put(str, autoCloseable);
        }
        C2763.m5116(autoCloseable2);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo768() {
    }
}
