package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥؘؔؗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0413 implements InterfaceC2090 {

    /* JADX INFO: renamed from: ۥۗ */
    public volatile Set f1501;

    /* JADX INFO: renamed from: ۥۣ */
    public volatile Set f1502;

    @Override // p000.InterfaceC2090
    public final Object get() {
        if (this.f1501 == null) {
            synchronized (this) {
                try {
                    if (this.f1501 == null) {
                        this.f1501 = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f1502.iterator();
                                while (it.hasNext()) {
                                    this.f1501.add(((InterfaceC2090) it.next()).get());
                                }
                                this.f1502 = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f1501);
    }
}
