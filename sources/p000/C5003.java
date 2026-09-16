package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦۘؒؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5003 implements Parcelable {
    public static final Parcelable.Creator<C5003> CREATOR = new C1432(8);

    /* JADX INFO: renamed from: ۥؓ */
    public final String f16553;

    /* JADX INFO: renamed from: ۥؖ */
    public final int f16554;

    /* JADX INFO: renamed from: ۥً */
    public final boolean f16555;

    /* JADX INFO: renamed from: ۥَ */
    public final int f16556;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f16557;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f16558;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f16559;

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean f16560;

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean f16561;

    /* JADX INFO: renamed from: ۥۧ */
    public final int f16562;

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean f16563;

    /* JADX INFO: renamed from: ۦٗ */
    public final String f16564;

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean f16565;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f16566;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f16567;

    public C5003(Parcel parcel) {
        this.f16567 = parcel.readString();
        this.f16566 = parcel.readString();
        this.f16557 = parcel.readInt() != 0;
        this.f16558 = parcel.readInt() != 0;
        this.f16556 = parcel.readInt();
        this.f16559 = parcel.readInt();
        this.f16564 = parcel.readString();
        this.f16565 = parcel.readInt() != 0;
        this.f16561 = parcel.readInt() != 0;
        this.f16563 = parcel.readInt() != 0;
        this.f16560 = parcel.readInt() != 0;
        this.f16554 = parcel.readInt();
        this.f16553 = parcel.readString();
        this.f16562 = parcel.readInt();
        this.f16555 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f16567);
        sb.append(" (");
        sb.append(this.f16566);
        sb.append(")}:");
        if (this.f16557) {
            sb.append(" fromLayout");
        }
        if (this.f16558) {
            sb.append(" dynamicContainer");
        }
        int i = this.f16559;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f16564;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f16565) {
            sb.append(" retainInstance");
        }
        if (this.f16561) {
            sb.append(" removing");
        }
        if (this.f16563) {
            sb.append(" detached");
        }
        if (this.f16560) {
            sb.append(" hidden");
        }
        String str2 = this.f16553;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f16562);
        }
        if (this.f16555) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16567);
        parcel.writeString(this.f16566);
        parcel.writeInt(this.f16557 ? 1 : 0);
        parcel.writeInt(this.f16558 ? 1 : 0);
        parcel.writeInt(this.f16556);
        parcel.writeInt(this.f16559);
        parcel.writeString(this.f16564);
        parcel.writeInt(this.f16565 ? 1 : 0);
        parcel.writeInt(this.f16561 ? 1 : 0);
        parcel.writeInt(this.f16563 ? 1 : 0);
        parcel.writeInt(this.f16560 ? 1 : 0);
        parcel.writeInt(this.f16554);
        parcel.writeString(this.f16553);
        parcel.writeInt(this.f16562);
        parcel.writeInt(this.f16555 ? 1 : 0);
    }

    public C5003(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        this.f16567 = abstractComponentCallbacksC0308.getClass().getName();
        this.f16566 = abstractComponentCallbacksC0308.f1118;
        this.f16557 = abstractComponentCallbacksC0308.f1137;
        this.f16558 = abstractComponentCallbacksC0308.f1148;
        this.f16556 = abstractComponentCallbacksC0308.f1146;
        this.f16559 = abstractComponentCallbacksC0308.f1113;
        this.f16564 = abstractComponentCallbacksC0308.f1150;
        this.f16565 = abstractComponentCallbacksC0308.f1126;
        this.f16561 = abstractComponentCallbacksC0308.f1114;
        this.f16563 = abstractComponentCallbacksC0308.f1124;
        this.f16560 = abstractComponentCallbacksC0308.f1153;
        this.f16554 = abstractComponentCallbacksC0308.f1138.ordinal();
        this.f16553 = abstractComponentCallbacksC0308.f1149;
        this.f16562 = abstractComponentCallbacksC0308.f1128;
        this.f16555 = abstractComponentCallbacksC0308.f1116;
    }
}
