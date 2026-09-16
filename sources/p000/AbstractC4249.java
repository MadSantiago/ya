package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦِٕؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4249 implements IInterface {

    /* JADX INFO: renamed from: ۥْ */
    public final String f14081;

    /* JADX INFO: renamed from: ۦ۟ */
    public final IBinder f14082;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14083;

    public /* synthetic */ AbstractC4249(IBinder iBinder, String str, int i) {
        this.f14083 = i;
        this.f14082 = iBinder;
        this.f14081 = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f14083) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f14082;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public Parcel m7504() {
        int i = this.f14083;
        String str = this.f14081;
        switch (i) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
        }
    }

    /* JADX INFO: renamed from: ۥٍ */
    public void m7505(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14082.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥٚ */
    public void m7506(Parcel parcel) {
        try {
            this.f14082.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public Parcel m7507(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14082.transact(i, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: ۥۣ */
    public Parcel m7508(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14082.transact(i, parcel, parcelObtain, 0);
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
