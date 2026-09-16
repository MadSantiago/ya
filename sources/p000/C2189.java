package p000;

import android.text.Editable;

/* JADX INFO: renamed from: ۥٌؚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2189 extends Editable.Factory {

    /* JADX INFO: renamed from: ۥؗ */
    public static Class f7265;

    /* JADX INFO: renamed from: ۥۗ */
    public static volatile C2189 f7266;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Object f7267 = new Object();

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f7265;
        return cls != null ? new C3097(cls, charSequence) : super.newEditable(charSequence);
    }
}
