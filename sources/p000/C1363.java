package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥؚٔؗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1363 implements InterfaceC5457 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f4682;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4682;
    }

    @Override // p000.InterfaceC5457
    /* JADX INFO: renamed from: ۥؖ */
    public final void mo2867(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC5457.f17993);
            parcelObtain.writeStringArray(strArr);
            this.f4682.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
