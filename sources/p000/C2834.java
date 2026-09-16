package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥۦؘؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2834 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9469;

    /* JADX INFO: renamed from: ۥۣ */
    public static C1347 m5402(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C2834.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new C1347();
        }
        C4250 c4250Mo629 = C0295.f1084.mo629();
        for (int i2 = 0; i2 < i; i2++) {
            c4250Mo629.add(parcel.readValue(classLoader));
        }
        return new C1347(c4250Mo629.m7514());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9469) {
            case 0:
                return m5402(parcel, null);
            default:
                return new C5412(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f9469) {
            case 0:
                return new C1347[i];
            default:
                return new C5412[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f9469) {
            case 0:
                return m5402(parcel, classLoader);
            default:
                return new C5412(parcel, classLoader);
        }
    }
}
