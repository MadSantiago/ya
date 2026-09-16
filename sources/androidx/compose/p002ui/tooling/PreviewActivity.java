package androidx.compose.p002ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import p000.AbstractActivityC1500;
import p000.AbstractC0684;
import p000.AbstractC4187;
import p000.C0092;
import p000.C0857;
import p000.C1078;
import p000.C3659;
import p000.C5713;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends AbstractActivityC1500 {

    /* JADX INFO: renamed from: ۥۦ */
    public static final /* synthetic */ int f164 = 0;

    /* JADX INFO: renamed from: ۦؖ */
    public final String f165 = "PreviewActivity";

    @Override // p000.AbstractActivityC1500, p000.AbstractActivityC1700, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.f165;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strM9762 = AbstractC0684.m9762(stringExtra, '.');
        String strM1535 = AbstractC0684.m1535('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strM1535 + "' without a parameter provider.");
            AbstractC4187.m7373(this, new C0857(-840626948, new C0092(1, strM9762, strM1535), true));
            return;
        }
        Log.d(str, "Previewing '" + strM1535 + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e);
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        int i2 = 0;
        if (cls == null) {
            AbstractC4187.m7373(this, new C0857(-1901447514, new C3659(strM9762, strM1535, new Object[0], 3), true));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i2 >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            z = true;
                            constructor = constructor2;
                        }
                    }
                    i2++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            if (constructor.newInstance(null) != null) {
                throw new ClassCastException();
            }
            if (intExtra >= 0) {
                throw null;
            }
            throw null;
        } catch (C5713 unused) {
            C1078.m2276("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
