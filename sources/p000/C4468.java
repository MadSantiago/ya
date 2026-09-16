package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦٖٙؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4468 implements InterfaceC0149, IInterface {

    /* JADX INFO: renamed from: ۦۨ */
    public final IBinder f14735;

    public C4468(IBinder iBinder) {
        this.f14735 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14735;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Parcel m7745(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14735.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
