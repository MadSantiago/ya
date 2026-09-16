package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import p000.AbstractC0186;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0186.m435(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
