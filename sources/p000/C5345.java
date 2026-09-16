package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: ۦُ۟ؔۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5345 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17601;

    /* JADX INFO: renamed from: ۥۗ */
    public final Configuration f17602;

    /* JADX INFO: renamed from: ۥۣ */
    public final ColorStateList f17603;

    public C5345(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f17603 = colorStateList;
        this.f17602 = configuration;
        this.f17601 = theme == null ? 0 : theme.hashCode();
    }
}
