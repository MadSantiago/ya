package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦُِٜؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4685 implements InterfaceC1583 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f15431;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15431;
    }

    @Override // p000.InterfaceC1583
    /* JADX INFO: renamed from: ۥۡ */
    public final IBinder mo1298() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(new C4441(new long[]{-4227181954456624583L, 3226653090517986955L, -437613895709643034L, -3470667860295730630L, 2698875477177477877L, 4240442391898916773L, -5463232215740245224L}).toString());
            this.f15431.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
