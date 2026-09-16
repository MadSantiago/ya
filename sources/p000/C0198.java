package p000;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۥؑؕؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0198 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3223 f727 = new C3223(8);

    /* JADX INFO: renamed from: ۦؑ */
    public static final LinkedHashMap f728 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public final C5002 f729;

    /* JADX INFO: renamed from: ۥۣ */
    public final ReentrantLock f730;

    public C0198(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (f727) {
            try {
                LinkedHashMap linkedHashMap = f728;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f730 = reentrantLock;
        this.f729 = z ? new C5002(str) : null;
    }
}
