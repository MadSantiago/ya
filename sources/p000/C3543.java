package p000;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: ۦؙٜؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3543 {

    /* JADX INFO: renamed from: ۦۗ */
    public static final Object f11761 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public int f11762;

    /* JADX INFO: renamed from: ۥُ */
    public volatile Object f11763;

    /* JADX INFO: renamed from: ۥّ */
    public volatile Object f11764;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4418 f11765;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f11766;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f11767;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f11768;

    /* JADX INFO: renamed from: ۦِ */
    public final RunnableC3365 f11769;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f11770;

    /* JADX INFO: renamed from: ۦۙ */
    public int f11771;

    public C3543(int i) {
        C0943 c0943 = C2796.f9348;
        this.f11767 = new Object();
        this.f11765 = new C4418();
        this.f11762 = 0;
        this.f11764 = f11761;
        this.f11769 = new RunnableC3365(8, this);
        this.f11763 = c0943;
        this.f11771 = 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m6343(String str) {
        C1774.m3564().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C1078.m2276(AbstractC3761.m6629("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6344(C4930 c4930) {
        if (this.f11766) {
            this.f11770 = true;
            return;
        }
        this.f11766 = true;
        do {
            this.f11770 = false;
            if (c4930 != null) {
                m6345(c4930);
                c4930 = null;
            } else {
                C4418 c4418 = this.f11765;
                c4418.getClass();
                C4305 c4305 = new C4305(c4418);
                c4418.f14565.put(c4305, Boolean.FALSE);
                while (c4305.hasNext()) {
                    m6345((C4930) ((Map.Entry) c4305.next()).getValue());
                    if (this.f11770) {
                        break;
                    }
                }
            }
        } while (this.f11770);
        this.f11766 = false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6345(C4930 c4930) {
        if (c4930.f16244) {
            int i = c4930.f16243;
            int i2 = this.f11771;
            if (i >= i2) {
                return;
            }
            c4930.f16243 = i2;
            C5086 c5086 = c4930.f16245;
            Object obj = this.f11763;
            c5086.getClass();
            InterfaceC4507 interfaceC4507 = (InterfaceC4507) obj;
            DialogInterfaceOnCancelListenerC2120 dialogInterfaceOnCancelListenerC2120 = (DialogInterfaceOnCancelListenerC2120) c5086.f16877;
            if (interfaceC4507 == null || !dialogInterfaceOnCancelListenerC2120.f6967) {
                return;
            }
            C5028.m8446(dialogInterfaceOnCancelListenerC2120, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6346(Object obj) {
        boolean z;
        synchronized (this.f11767) {
            z = this.f11764 == f11761;
            this.f11764 = obj;
        }
        if (z) {
            C1774 c1774M3564 = C1774.m3564();
            RunnableC3365 runnableC3365 = this.f11769;
            C4328 c4328 = c1774M3564.f5925;
            if (c4328.f14300 == null) {
                synchronized (c4328.f14299) {
                    try {
                        if (c4328.f14300 == null) {
                            c4328.f14300 = C4328.m7628(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            c4328.f14300.post(runnableC3365);
        }
    }

    public C3543() {
        this.f11767 = new Object();
        this.f11765 = new C4418();
        this.f11762 = 0;
        Object obj = f11761;
        this.f11764 = obj;
        this.f11769 = new RunnableC3365(8, this);
        this.f11763 = obj;
        this.f11771 = -1;
    }
}
