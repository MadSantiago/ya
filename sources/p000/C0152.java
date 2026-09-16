package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥُؚؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0152 implements InterfaceC1613 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final AtomicReference f586 = new AtomicReference();

    @Override // p000.InterfaceC1613
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo324(boolean z) {
        synchronized (C0377.f1404) {
            try {
                for (C0377 c0377 : new ArrayList(C0377.f1403.values())) {
                    if (c0377.f1406.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = c0377.f1413.iterator();
                        while (it.hasNext()) {
                            C0377 c0378 = ((C1428) it.next()).f4903;
                            if (!z) {
                                ((C0161) c0378.f1409.get()).m343();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
