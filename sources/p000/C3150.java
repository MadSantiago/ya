package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦٖؓؑٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3150 implements InterfaceC1897 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f10630;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10630;
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۥؔ */
    public final void mo161() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(new C4441(new long[]{8544977459438811031L, 5642060025234538908L, -7921907457003336745L, 5460310455651385450L, -4255407873026566299L, 7723939499518640154L, 1662776528013551467L}).toString());
            this.f10630.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۥَ */
    public final void mo162(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(new C4441(new long[]{-7623957730058450809L, 1942537475131809109L, 6777969779003645120L, 8668926490680291379L, 2516143908084985660L, -5963105022836899149L, -4472109650322418201L}).toString());
            parcelObtain.writeString(str);
            this.f10630.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo163(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(new C4441(new long[]{4294002354232756458L, -645074287408817629L, 8208905492284438461L, 8975436949547306561L, -142950858238185519L, 7931991747121374610L, -8514698084476323389L}).toString());
            parcelObtain.writeString(str);
            this.f10630.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC1897
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo164(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(new C4441(new long[]{-4385979560015503954L, -5979841338716661532L, 5919888019534233221L, -3900773502702358325L, 1216044942181618842L, 1554966261712174208L, 2995079678222468539L}).toString());
            parcelObtain.writeString(str);
            this.f10630.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
