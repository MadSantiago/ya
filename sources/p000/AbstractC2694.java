package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؙۤؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2694 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ int f8937 = 0;

    static {
        AbstractC2694.class.getClassLoader();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m5022(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC5078.m8670(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Parcelable m5023(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
