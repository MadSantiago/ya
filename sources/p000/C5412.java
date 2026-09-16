package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦِ۠ؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5412 extends AbstractC0090 {
    public static final Parcelable.Creator<C5412> CREATOR = new C2834(1);

    /* JADX INFO: renamed from: ۥْ */
    public boolean f17866;

    public C5412(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C5412.class.getClassLoader();
        }
        this.f17866 = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0090, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f17866 ? 1 : 0);
    }
}
