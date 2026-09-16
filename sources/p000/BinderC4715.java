package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦؚٜۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4715 extends Binder implements InterfaceC5457 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5024 f15545;

    public BinderC4715(C5024 c5024) {
        this.f15545 = c5024;
        attachInterface(this, InterfaceC5457.f17993);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC5457.f17993;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo2867(parcel.createStringArray());
        return true;
    }

    @Override // p000.InterfaceC5457
    /* JADX INFO: renamed from: ۥؖ */
    public final void mo2867(String[] strArr) {
        C5024 c5024 = this.f15545;
        AbstractC2765.m5135(c5024.f16629, null, 0, new C0061(strArr, c5024, null, 22), 3);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
