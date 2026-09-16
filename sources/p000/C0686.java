package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: ۥًؘْؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0686 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0686> CREATOR = new C1432(10);

    /* JADX INFO: renamed from: ۦۨ */
    public int f2498;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f2498;
        if (i != 1) {
            str = i != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return AbstractC3761.m6621(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f2498));
    }
}
