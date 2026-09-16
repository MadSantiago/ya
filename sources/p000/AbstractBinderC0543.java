package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥؖؕۥۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0543 extends Binder implements IInterface {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1959 = 0;

    public AbstractBinderC0543(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f1959;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f1959) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                BinderC0913 binderC0913 = (BinderC0913) this;
                boolean z = false;
                switch (i) {
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        AbstractC2694.m5022(parcel);
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        AbstractC2694.m5022(parcel);
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        AbstractC2694.m5022(parcel);
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        AbstractC2694.m5022(parcel);
                        break;
                    case 8:
                        C2209 c2209 = (C2209) AbstractC2694.m5023(parcel, C2209.CREATOR);
                        AbstractC2694.m5022(parcel);
                        binderC0913.f3279.post(new RunnableC4985(17, binderC0913, c2209, z));
                        break;
                    case 9:
                        AbstractC2694.m5022(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo1238(i, parcel, parcel2);
        }
    }

    /* JADX INFO: renamed from: ۥٍ */
    public boolean mo1238(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public /* synthetic */ AbstractBinderC0543() {
    }
}
