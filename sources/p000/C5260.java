package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦۜؑؐۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5260 extends ContextWrapper {

    /* JADX INFO: renamed from: ۥّ */
    public static Configuration f17344;

    /* JADX INFO: renamed from: ۥؗ */
    public LayoutInflater f17345;

    /* JADX INFO: renamed from: ۥُ */
    public Resources f17346;

    /* JADX INFO: renamed from: ۥۗ */
    public Resources.Theme f17347;

    /* JADX INFO: renamed from: ۥۣ */
    public int f17348;

    /* JADX INFO: renamed from: ۦؑ */
    public Configuration f17349;

    public C5260(Context context, int i) {
        super(context);
        this.f17348 = i;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.f17346;
        if (resources != null) {
            return resources;
        }
        Configuration configuration = this.f17349;
        if (configuration != null) {
            Configuration configuration2 = f17344;
            if (configuration2 == null) {
                configuration2 = new Configuration();
                configuration2.fontScale = 0.0f;
                f17344 = configuration2;
            }
            if (!configuration.equals(configuration2)) {
                Resources resources2 = createConfigurationContext(this.f17349).getResources();
                this.f17346 = resources2;
                return resources2;
            }
        }
        Resources resources3 = super.getResources();
        this.f17346 = resources3;
        return resources3;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.f17345;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.f17345 = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f17347;
        if (theme != null) {
            return theme;
        }
        if (this.f17348 == 0) {
            this.f17348 = R.style.Theme_AppCompat_Light;
        }
        m8894();
        return this.f17347;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f17348 != i) {
            this.f17348 = i;
            m8894();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8894() {
        if (this.f17347 == null) {
            this.f17347 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17347.setTo(theme);
            }
        }
        this.f17347.applyStyle(this.f17348, true);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8895(Configuration configuration) {
        if (this.f17346 != null) {
            C1078.m2276("getResources() or getAssets() has already been called");
        } else if (this.f17349 == null) {
            this.f17349 = new Configuration(configuration);
        } else {
            C1078.m2276("Override configuration has already been set");
        }
    }
}
