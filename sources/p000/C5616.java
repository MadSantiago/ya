package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦۣؖۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5616 implements InterfaceC2376 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f18507;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18507;
    }

    @Override // p000.InterfaceC2376
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo4449(int i, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC2376.f7866);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.f18507.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC2376
    /* JADX INFO: renamed from: ۥً */
    public final int mo4450(InterfaceC5457 interfaceC5457, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC2376.f7866);
            parcelObtain.writeStrongInterface(interfaceC5457);
            parcelObtain.writeString(str);
            this.f18507.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
