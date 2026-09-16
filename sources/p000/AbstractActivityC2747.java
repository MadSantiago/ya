package p000;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥۥٌؕٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2747 extends AbstractActivityC1500 implements InterfaceC0125 {

    /* JADX INFO: renamed from: ۥؔ */
    public LayoutInflaterFactory2C1852 f9087;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f9090;

    /* JADX INFO: renamed from: ۦُ */
    public boolean f9091;

    /* JADX INFO: renamed from: ۦؖ */
    public final C4228 f9089 = new C4228(25, new C0827(this));

    /* JADX INFO: renamed from: ۥۦ */
    public final C4170 f9088 = new C4170(this, true);

    /* JADX INFO: renamed from: ۦٖ */
    public boolean f9092 = true;

    public AbstractActivityC2747() {
        final int i = 1;
        ((C2346) this.f5091.f7785).m4413("android:support:lifecycle", new C5444(2, this));
        final int i2 = 0;
        m3178(new InterfaceC3281(this) { // from class: ۥۢؖۖٙ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ AbstractActivityC2747 f8737;

            {
                this.f8737 = this;
            }

            @Override // p000.InterfaceC3281
            public final void accept(Object obj) {
                int i3 = i2;
                AbstractActivityC2747 abstractActivityC2747 = this.f8737;
                switch (i3) {
                    case 0:
                        abstractActivityC2747.f9089.m7499();
                        break;
                    default:
                        abstractActivityC2747.f9089.m7499();
                        break;
                }
            }
        });
        this.f5094.add(new InterfaceC3281(this) { // from class: ۥۢؖۖٙ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ AbstractActivityC2747 f8737;

            {
                this.f8737 = this;
            }

            @Override // p000.InterfaceC3281
            public final void accept(Object obj) {
                int i3 = i;
                AbstractActivityC2747 abstractActivityC2747 = this.f8737;
                switch (i3) {
                    case 0:
                        abstractActivityC2747.f9089.m7499();
                        break;
                    default:
                        abstractActivityC2747.f9089.m7499();
                        break;
                }
            }
        });
        m3181(new C0301(this, i));
        ((C2346) this.f5091.f7785).m4413("androidx:appcompat", new C2913(this));
        m3181(new C5811(this));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static boolean m5098(C2790 c2790) {
        boolean zM5098 = false;
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : c2790.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null) {
                C0827 c0827 = abstractComponentCallbacksC0308.f1136;
                if ((c0827 == null ? null : c0827.f2926) != null) {
                    zM5098 |= m5098(abstractComponentCallbacksC0308.m659());
                }
                if (abstractComponentCallbacksC0308.f1152.f13874.m976(EnumC0458.f1654)) {
                    C4170 c4170 = abstractComponentCallbacksC0308.f1152;
                    c4170.m7368("setCurrentState");
                    c4170.m7366(EnumC0458.f1653);
                    zM5098 = true;
                }
            }
        }
        return zM5098;
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3180();
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        layoutInflaterFactory2C1852.m3650();
        ((ViewGroup) layoutInflaterFactory2C1852.f6187.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1852.f6144.m9580(layoutInflaterFactory2C1852.f6147.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0192  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:136:0x020c A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #0 {, blocks: (B:127:0x01ee, B:129:0x01f2, B:135:0x020a, B:136:0x020c, B:138:0x0210, B:144:0x0220, B:143:0x0217, B:134:0x0203), top: B:154:0x01ee, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:93:0x0165  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        C5260 c5260;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        layoutInflaterFactory2C1852.f6188 = true;
        int i41 = layoutInflaterFactory2C1852.f6166;
        if (i41 == -100) {
            i41 = AbstractC3533.f11723;
        }
        int iM3643 = layoutInflaterFactory2C1852.m3643(context, i41);
        if (AbstractC3533.m6323(context) && AbstractC3533.m6323(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC3533.f11720) {
                    try {
                        C1257 c1257 = AbstractC3533.f11717;
                        if (c1257 == null) {
                            C1257 c1257M2656 = AbstractC3533.f11718;
                            if (c1257M2656 == null) {
                                c1257M2656 = C1257.m2656(AbstractC3831.m6873(context));
                                AbstractC3533.f11718 = c1257M2656;
                            }
                            if (!c1257M2656.f4324.f11452.isEmpty()) {
                                AbstractC3533.f11717 = AbstractC3533.f11718;
                            }
                        } else if (!c1257.equals(AbstractC3533.f11718)) {
                            C1257 c1258 = AbstractC3533.f11717;
                            AbstractC3533.f11718 = c1258;
                            AbstractC3831.m6861(context, c1258.f4324.f11452.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC3533.f11719) {
                AbstractC3533.f11724.execute(new RunnableC0029(6, context));
            }
        }
        C1257 c1257M3639 = LayoutInflaterFactory2C1852.m3639(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1852.m3638(context, iM3643, c1257M3639, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C5260) {
                    try {
                        ((C5260) context).m8895(LayoutInflaterFactory2C1852.m3638(context, iM3643, c1257M3639, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C1852.f6143) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    AbstractC1937.m3801(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    i25 = configuration.colorMode & 3;
                                    i26 = configuration2.colorMode & 3;
                                    if (i25 != i26) {
                                        configuration3.colorMode |= i26;
                                    }
                                    i27 = configuration.colorMode & 12;
                                    i28 = configuration2.colorMode & 12;
                                    if (i27 != i28) {
                                        configuration3.colorMode |= i28;
                                    }
                                    i29 = configuration.uiMode & 15;
                                    i30 = configuration2.uiMode & 15;
                                    if (i29 != i30) {
                                        configuration3.uiMode |= i30;
                                    }
                                    i31 = configuration.uiMode & 48;
                                    i32 = configuration2.uiMode & 48;
                                    if (i31 != i32) {
                                        configuration3.uiMode |= i32;
                                    }
                                    i33 = configuration.screenWidthDp;
                                    i34 = configuration2.screenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.screenWidthDp = i34;
                                    }
                                    i35 = configuration.screenHeightDp;
                                    i36 = configuration2.screenHeightDp;
                                    if (i35 != i36) {
                                        configuration3.screenHeightDp = i36;
                                    }
                                    i37 = configuration.smallestScreenWidthDp;
                                    i38 = configuration2.smallestScreenWidthDp;
                                    if (i37 != i38) {
                                        configuration3.smallestScreenWidthDp = i38;
                                    }
                                    i39 = configuration.densityDpi;
                                    i40 = configuration2.densityDpi;
                                    if (i39 != i40) {
                                        configuration3.densityDpi = i40;
                                    }
                                }
                            }
                            Configuration configurationM3638 = LayoutInflaterFactory2C1852.m3638(context, iM3643, c1257M3639, configuration3, true);
                            c5260 = new C5260(context, ru.bluecat.yandexmapspatcher.R.style.Theme_AppCompat_Empty);
                            c5260.m8895(configurationM3638);
                            try {
                                if (context.getTheme() != null) {
                                    theme = c5260.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        AbstractC5183.m8793(theme);
                                    } else {
                                        synchronized (C4773.f15727) {
                                            if (C4773.f15733) {
                                                method = C4773.f15730;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    C4773.f15730 = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                C4773.f15733 = true;
                                                method = C4773.f15730;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        C4773.f15730 = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c5260;
                        }
                    }
                } else if (LayoutInflaterFactory2C1852.f6143) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            AbstractC1937.m3801(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationM3639 = LayoutInflaterFactory2C1852.m3638(context, iM3643, c1257M3639, configuration3, true);
                    c5260 = new C5260(context, ru.bluecat.yandexmapspatcher.R.style.Theme_AppCompat_Empty);
                    c5260.m8895(configurationM3639);
                    if (context.getTheme() != null) {
                        theme = c5260.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            AbstractC5183.m8793(theme);
                        } else {
                            synchronized (C4773.f15727) {
                                if (C4773.f15733) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    C4773.f15730 = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    C4773.f15733 = true;
                                    method = C4773.f15730;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = C4773.f15730;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = c5260;
                }
            }
        } else if (context instanceof C5260) {
            ((C5260) context).m8895(LayoutInflaterFactory2C1852.m3638(context, iM3643, c1257M3639, null, false));
        } else if (LayoutInflaterFactory2C1852.f6143) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    AbstractC1937.m3801(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.colorMode & 3;
                    i26 = configuration2.colorMode & 3;
                    if (i25 != i26) {
                        configuration3.colorMode |= i26;
                    }
                    i27 = configuration.colorMode & 12;
                    i28 = configuration2.colorMode & 12;
                    if (i27 != i28) {
                        configuration3.colorMode |= i28;
                    }
                    i29 = configuration.uiMode & 15;
                    i30 = configuration2.uiMode & 15;
                    if (i29 != i30) {
                        configuration3.uiMode |= i30;
                    }
                    i31 = configuration.uiMode & 48;
                    i32 = configuration2.uiMode & 48;
                    if (i31 != i32) {
                        configuration3.uiMode |= i32;
                    }
                    i33 = configuration.screenWidthDp;
                    i34 = configuration2.screenWidthDp;
                    if (i33 != i34) {
                        configuration3.screenWidthDp = i34;
                    }
                    i35 = configuration.screenHeightDp;
                    i36 = configuration2.screenHeightDp;
                    if (i35 != i36) {
                        configuration3.screenHeightDp = i36;
                    }
                    i37 = configuration.smallestScreenWidthDp;
                    i38 = configuration2.smallestScreenWidthDp;
                    if (i37 != i38) {
                        configuration3.smallestScreenWidthDp = i38;
                    }
                    i39 = configuration.densityDpi;
                    i40 = configuration2.densityDpi;
                    if (i39 != i40) {
                        configuration3.densityDpi = i40;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationM36310 = LayoutInflaterFactory2C1852.m3638(context, iM3643, c1257M3639, configuration3, true);
            c5260 = new C5260(context, ru.bluecat.yandexmapspatcher.R.style.Theme_AppCompat_Empty);
            c5260.m8895(configurationM36310);
            if (context.getTheme() != null) {
                theme = c5260.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC5183.m8793(theme);
                } else {
                    synchronized (C4773.f15727) {
                        if (C4773.f15733) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            C4773.f15730 = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            C4773.f15733 = true;
                            method = C4773.f15730;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = C4773.f15730;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = c5260;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C1852) m5101()).m3640();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p000.AbstractActivityC1700, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C1852) m5101()).m3640();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f9090);
        printWriter.print(" mResumed=");
        printWriter.print(this.f9091);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9092);
        if (getApplication() != null) {
            C3369.m6127(this).m6140(str3, printWriter);
        }
        ((C0827) this.f9089.f14025).f2925.m5282(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        layoutInflaterFactory2C1852.m3650();
        return layoutInflaterFactory2C1852.f6147.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        C3837 c3837 = layoutInflaterFactory2C1852.f6150;
        if (c3837 == null) {
            layoutInflaterFactory2C1852.m3640();
            C4075 c4075 = layoutInflaterFactory2C1852.f6170;
            c3837 = new C3837(c4075 != null ? c4075.m7261() : layoutInflaterFactory2C1852.f6156);
            layoutInflaterFactory2C1852.f6150 = c3837;
        }
        return c3837;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC4569.f15076;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        if (layoutInflaterFactory2C1852.f6170 != null) {
            layoutInflaterFactory2C1852.m3640();
            layoutInflaterFactory2C1852.f6170.getClass();
            layoutInflaterFactory2C1852.m3655(0);
        }
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f9089.m7499();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        if (layoutInflaterFactory2C1852.f6173 && layoutInflaterFactory2C1852.f6145) {
            layoutInflaterFactory2C1852.m3640();
            C4075 c4075 = layoutInflaterFactory2C1852.f6170;
            if (c4075 != null) {
                c4075.m7259(c4075.f13578.getResources().getBoolean(ru.bluecat.yandexmapspatcher.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C3465 c3465M6241 = C3465.m6241();
        Context context = layoutInflaterFactory2C1852.f6156;
        synchronized (c3465M6241) {
            C0141 c0141 = c3465M6241.f11498;
            synchronized (c0141) {
                C0638 c0638 = (C0638) c0141.f559.get(context);
                if (c0638 != null) {
                    c0638.m1454();
                }
            }
        }
        layoutInflaterFactory2C1852.f6175 = new Configuration(layoutInflaterFactory2C1852.f6156.getResources().getConfiguration());
        layoutInflaterFactory2C1852.m3665(false, false);
    }

    @Override // p000.AbstractActivityC1500, p000.AbstractActivityC1700, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9088.m7369(EnumC1924.ON_CREATE);
        C2790 c2790 = ((C0827) this.f9089.f14025).f2925;
        c2790.f9317 = false;
        c2790.f9314 = false;
        c2790.f9335.f1249 = false;
        c2790.m5305(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C5189 c5189 = (C5189) ((C0827) this.f9089.f14025).f2925.f9302.onCreateView(null, str, context, attributeSet);
        return c5189 == null ? super.onCreateView(str, context, attributeSet) : c5189;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m5100();
        m5101().mo3645();
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM8644;
        if (!m5102(i, menuItem)) {
            LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
            layoutInflaterFactory2C1852.m3640();
            C4075 c4075 = layoutInflaterFactory2C1852.f6170;
            if (menuItem.getItemId() != 16908332 || c4075 == null || (((C0251) c4075.f13570).f928 & 4) == 0 || (intentM8644 = C5063.m8644(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM8644)) {
                navigateUpTo(intentM8644);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM8645 = C5063.m8644(this);
            if (intentM8645 == null) {
                intentM8645 = C5063.m8644(this);
            }
            if (intentM8645 != null) {
                ComponentName component = intentM8645.getComponent();
                if (component == null) {
                    component = intentM8645.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM8619 = C5063.m8619(this, component);
                    while (intentM8619 != null) {
                        arrayList.add(size, intentM8619);
                        intentM8619 = C5063.m8619(this, intentM8619.getComponent());
                    }
                    arrayList.add(intentM8645);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                C1078.m2276("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f9091 = false;
        ((C0827) this.f9089.f14025).f2925.m5305(5);
        this.f9088.m7369(EnumC1924.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1852) m5101()).m3650();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m5104();
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        layoutInflaterFactory2C1852.m3640();
        C4075 c4075 = layoutInflaterFactory2C1852.f6170;
        if (c4075 != null) {
            c4075.f13574 = true;
        }
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f9089.m7499();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C4228 c4228 = this.f9089;
        c4228.m7499();
        super.onResume();
        this.f9091 = true;
        ((C0827) c4228.f14025).f2925.m5265(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        m5103();
        ((LayoutInflaterFactory2C1852) m5101()).m3665(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f9089.m7499();
    }

    @Override // android.app.Activity
    public final void onStop() {
        m5099();
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) m5101();
        layoutInflaterFactory2C1852.m3640();
        C4075 c4075 = layoutInflaterFactory2C1852.f6170;
        if (c4075 != null) {
            c4075.f13574 = false;
            C4799 c4799 = c4075.f13569;
            if (c4799 != null) {
                c4799.m8177();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m5101().mo3658(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C1852) m5101()).m3640();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity
    public final void setContentView(int i) {
        m3180();
        m5101().mo3663(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C1852) m5101()).f6172 = i;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m5099() {
        C4228 c4228;
        super.onStop();
        this.f9092 = true;
        do {
            c4228 = this.f9089;
        } while (m5098(((C0827) c4228.f14025).f2925));
        C2790 c2790 = ((C0827) c4228.f14025).f2925;
        c2790.f9314 = true;
        c2790.f9335.f1249 = true;
        c2790.m5305(4);
        this.f9088.m7369(EnumC1924.ON_STOP);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m5100() {
        super.onDestroy();
        ((C0827) this.f9089.f14025).f2925.m5300();
        this.f9088.m7369(EnumC1924.ON_DESTROY);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final AbstractC3533 m5101() {
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f9087;
        if (layoutInflaterFactory2C1852 != null) {
            return layoutInflaterFactory2C1852;
        }
        ExecutorC2205 executorC2205 = AbstractC3533.f11724;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1853 = new LayoutInflaterFactory2C1852(this, null, this, this);
        this.f9087 = layoutInflaterFactory2C1853;
        return layoutInflaterFactory2C1853;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m5102(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0827) this.f9089.f14025).f2925.m5302();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m5103() {
        C4228 c4228 = this.f9089;
        c4228.m7499();
        C0827 c0827 = (C0827) c4228.f14025;
        super.onStart();
        this.f9092 = false;
        if (!this.f9090) {
            this.f9090 = true;
            C2790 c2790 = c0827.f2925;
            c2790.f9317 = false;
            c2790.f9314 = false;
            c2790.f9335.f1249 = false;
            c2790.m5305(4);
        }
        c0827.f2925.m5265(true);
        this.f9088.m7369(EnumC1924.ON_START);
        C2790 c2791 = c0827.f2925;
        c2791.f9317 = false;
        c2791.f9314 = false;
        c2791.f9335.f1249 = false;
        c2791.m5305(5);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m5104() {
        super.onPostResume();
        this.f9088.m7369(EnumC1924.ON_RESUME);
        C2790 c2790 = ((C0827) this.f9089.f14025).f2925;
        c2790.f9317 = false;
        c2790.f9314 = false;
        c2790.f9335.f1249 = false;
        c2790.m5305(7);
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity
    public void setContentView(View view) {
        m3180();
        m5101().mo3659(view);
    }

    @Override // p000.AbstractActivityC1500, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3180();
        m5101().mo3664(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C5189 c5189 = (C5189) ((C0827) this.f9089.f14025).f2925.f9302.onCreateView(view, str, context, attributeSet);
        return c5189 == null ? super.onCreateView(view, str, context, attributeSet) : c5189;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
