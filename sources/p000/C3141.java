package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: ۦؒۘۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3141 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Object[] f10608 = new Object[2];

    /* JADX INFO: renamed from: ۥۗ */
    public static final Class[] f10604 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: ۥؗ */
    public static final int[] f10601 = {R.attr.onClick};

    /* JADX INFO: renamed from: ۦؑ */
    public static final int[] f10606 = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: ۥُ */
    public static final int[] f10602 = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: ۥّ */
    public static final int[] f10603 = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: ۦۙ */
    public static final String[] f10607 = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: ۥۜ */
    public static final C0796 f10605 = new C0796(0);

    /* JADX INFO: renamed from: ۥؗ */
    public C5653 mo131(Context context, AttributeSet attributeSet) {
        return new C5653(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۥُ */
    public C3755 mo132(Context context, AttributeSet attributeSet) {
        return new C3755(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final View m5817(Context context, String str, String str2) {
        String strConcat;
        C0796 c0796 = f10605;
        Constructor constructor = (Constructor) c0796.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f10604);
            c0796.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f10608);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C2465 mo133(Context context, AttributeSet attributeSet) {
        return new C2465(context, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C1123 mo134(Context context, AttributeSet attributeSet) {
        return new C1123(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public C3526 mo135(Context context, AttributeSet attributeSet) {
        return new C3526(context, attributeSet);
    }
}
