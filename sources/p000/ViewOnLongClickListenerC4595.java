package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۦٍّٛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC4595 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C4524.f14953.getClass();
        C1443 c1443M7845 = C4524.m7845();
        C1542 c1542 = AbstractC2539.f8454;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        int i = ((Boolean) c1443M7845.m3068(obj, str)).booleanValue() ? 8388608 : 268435456;
        try {
            Intent intent = new Intent(new C4441(new long[]{7849376638189666666L, 4451563476975854172L, -3516538357171969157L, -3703888492364855988L, -2232801269042521434L}).toString());
            String string = new C4441(new long[]{3395337622363671645L, -6057906299108868794L, -1115606595917735727L, 8141927997678985137L, -2205363530818039814L}).toString();
            Class<MainActivity> cls = MainActivity.class;
            Class<MainActivity> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
            if (clsM9037 != null) {
                cls = clsM9037;
            }
            intent.setClassName(string, cls.getName());
            intent.addFlags(i);
            view.getContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(view.getContext(), AbstractC4009.m7184(R.string.module_settings_exp, new Object[0]), 1).show();
            return true;
        }
    }
}
