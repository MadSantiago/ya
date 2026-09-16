package p000;

import android.R;
import android.os.Build;

/* JADX INFO: renamed from: ۥؘُؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1062 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(AbstractC0993.f3546, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(AbstractC0993.f3543, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(AbstractC0993.f3544, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(AbstractC0993.f3542, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(AbstractC0993.f3537, Build.VERSION.SDK_INT <= 26 ? ru.bluecat.yandexmapspatcher.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);


    /* JADX INFO: renamed from: ۥْ */
    public final int f3742;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f3743;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f3744;

    EnumC1062(Object obj, int i, int i2) {
        this.f3744 = obj;
        this.f3743 = i;
        this.f3742 = i2;
    }
}
