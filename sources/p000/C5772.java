package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: renamed from: ۦۦٕؖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5772 implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C5772> CREATOR = new C1432(11);

    /* JADX INFO: renamed from: ۦ۟ */
    public final Map f19023;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f19024;

    public C5772(String str, Map map) {
        this.f19024 = str;
        this.f19023 = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5772)) {
            return false;
        }
        C5772 c5772 = (C5772) obj;
        return AbstractC3831.m6874(this.f19024, c5772.f19024) && AbstractC3831.m6874(this.f19023, c5772.f19023);
    }

    public final int hashCode() {
        return this.f19023.hashCode() + (this.f19024.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f19024 + ", extras=" + this.f19023 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19024);
        Map map = this.f19023;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
