package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦؘۙٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5136 extends AbstractC2132 implements InterfaceC1312 {

    /* JADX INFO: renamed from: ۥَ */
    public final C5136 f17018;

    /* JADX INFO: renamed from: ۥْ */
    public final String f17019;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f17020;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Handler f17021;

    public C5136(Handler handler, String str, boolean z) {
        this.f17021 = handler;
        this.f17019 = str;
        this.f17020 = z;
        this.f17018 = z ? this : new C5136(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5136)) {
            return false;
        }
        C5136 c5136 = (C5136) obj;
        return c5136.f17021 == this.f17021 && c5136.f17020 == this.f17020;
    }

    public final int hashCode() {
        return (this.f17020 ? 1231 : 1237) ^ System.identityHashCode(this.f17021);
    }

    @Override // p000.AbstractC2132
    public final String toString() {
        C5136 c5136;
        String str;
        C0649 c0649 = AbstractC0912.f3276;
        C5136 c5137 = AbstractC5794.f19088;
        if (this == c5137) {
            str = "Dispatchers.Main";
        } else {
            try {
                c5136 = c5137.f17018;
            } catch (UnsupportedOperationException unused) {
                c5136 = null;
            }
            str = this == c5136 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f17019;
        if (string == null) {
            string = this.f17021.toString();
        }
        if (!this.f17020) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        if (this.f17021.post(runnable)) {
            return;
        }
        m8748(interfaceC3534, runnable);
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥۡ */
    public final boolean mo4118(InterfaceC3534 interfaceC3534) {
        return (this.f17020 && AbstractC3831.m6874(Looper.myLooper(), this.f17021.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m8748(InterfaceC3534 interfaceC3534, Runnable runnable) {
        AbstractC5568.m9380(interfaceC3534, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0649 c0649 = AbstractC0912.f3276;
        ExecutorC4540.f15006.mo1466(interfaceC3534, runnable);
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC4883 mo1552(long j, Runnable runnable, InterfaceC3534 interfaceC3534) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f17021.postDelayed(runnable, j)) {
            return new C1921(0, this, runnable);
        }
        m8748(interfaceC3534, runnable);
        return C3364.f11240;
    }

    @Override // p000.InterfaceC1312
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1553(long j, C2600 c2600) {
        RunnableC5689 runnableC5689 = new RunnableC5689(12, c2600, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f17021.postDelayed(runnableC5689, j)) {
            c2600.m4908(new C0079(16, this, runnableC5689));
        } else {
            m8748(c2600.f8690, runnableC5689);
        }
    }

    public C5136(Handler handler) {
        this(handler, null, false);
    }
}
