package p000;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦٖۢؗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5564 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ClassLoader f18370 = AbstractC5564.class.getClassLoader();

    /* JADX INFO: renamed from: ۥؗ */
    public static void m9344(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m9345(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Parcelable m9346(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m9347(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC5078.m8673(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }
}
