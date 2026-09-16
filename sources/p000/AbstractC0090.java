package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦۛ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0090 implements Parcelable {

    /* JADX INFO: renamed from: ۦۨ */
    public final Parcelable f17201;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C0076 f17200 = new C0076();
    public static final Parcelable.Creator<AbstractC0090> CREATOR = new C0589(1);

    public AbstractC0090(Parcelable parcelable) {
        if (parcelable != null) {
            this.f17201 = parcelable == f17200 ? null : parcelable;
        } else {
            C1078.m2272("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f17201, i);
    }

    public AbstractC0090() {
        this.f17201 = null;
    }

    public AbstractC0090(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f17201 = parcelable == null ? f17200 : parcelable;
    }
}
