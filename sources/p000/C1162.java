package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: renamed from: ۥّؔۘؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1162 implements Parcelable {

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f4031;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final ClassLoader f4030 = C1162.class.getClassLoader();

    /* JADX INFO: renamed from: ۥْ */
    public static final C1432 f4029 = new C1432(9);

    public C1162(Parcel parcel) {
        this.f4031 = parcel.readValue(f4030);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f4031);
    }

    public C1162(Serializable serializable) {
        this.f4031 = serializable;
    }

    public C1162() {
        this.f4031 = null;
    }
}
