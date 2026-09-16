package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؗؒٔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0589 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f2194;

    public /* synthetic */ C0589(int i) {
        this.f2194 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C4852 m1300(Parcel parcel, ClassLoader classLoader) {
        InterfaceC0241 interfaceC0241;
        if (classLoader == null) {
            classLoader = C0589.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            interfaceC0241 = C0373.f1364;
        } else if (i == 1) {
            interfaceC0241 = C1298.f4439;
        } else {
            if (i != 2) {
                C1078.m2276(AbstractC5078.m8681(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            interfaceC0241 = C1397.f4792;
        }
        return new C4852(value, interfaceC0241);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2194) {
            case 0:
                return m1300(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0090.f17200;
                }
                C1078.m2276("superState must be null");
                return null;
            default:
                return new C1619(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2194) {
            case 0:
                return new C4852[i];
            case 1:
                return new AbstractC0090[i];
            default:
                return new C1619[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2194) {
            case 0:
                return m1300(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0090.f17200;
                }
                C1078.m2276("superState must be null");
                return null;
            default:
                return new C1619(parcel, null);
        }
    }
}
