package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٌٜؕٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0902 extends AbstractBinderC1892 implements InterfaceC3838 {

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f3244;

    /* JADX INFO: renamed from: ۦۨ */
    public final AtomicReference f3245;

    public BinderC0902() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f3245 = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /* JADX INFO: renamed from: ۥؗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1886(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L38
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.BinderC0902.m1886(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Bundle m1887(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f3245;
        synchronized (atomicReference) {
            if (!this.f3244) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f3245.get();
        }
        return bundle;
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
        AbstractC5564.m9347(parcel);
        mo1888(bundle);
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.InterfaceC3838
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1888(Bundle bundle) {
        AtomicReference atomicReference = this.f3245;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f3244 = true;
                    this.f3245.notify();
                } catch (Throwable th) {
                    this.f3245.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
