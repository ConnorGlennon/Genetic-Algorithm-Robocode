import robocode.BattleResults;
import robocode.control.events.BattleCompletedEvent;
import robocode.control.events.BattleErrorEvent;
import robocode.control.events.BattleFinishedEvent;
import robocode.control.events.BattleMessageEvent;
import robocode.control.events.BattlePausedEvent;
import robocode.control.events.BattleResumedEvent;
import robocode.control.events.BattleStartedEvent;
import robocode.control.events.IBattleListener;
import robocode.control.events.RoundEndedEvent;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.events.TurnStartedEvent;

public class BattleObserver implements IBattleListener {

	@Override
	public void onBattleCompleted(BattleCompletedEvent arg0) {
		BattleResults[] battleResultsArray = arg0.getSortedResults();
		for(BattleResults battleResults: battleResultsArray) {
			System.out.println(battleResults.getRank() + ": " + battleResults.getTeamLeaderName());
		}
	}

	@Override
	public void onBattleError(BattleErrorEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBattleFinished(BattleFinishedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBattleMessage(BattleMessageEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBattlePaused(BattlePausedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBattleResumed(BattleResumedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBattleStarted(BattleStartedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRoundEnded(RoundEndedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRoundStarted(RoundStartedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTurnEnded(TurnEndedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTurnStarted(TurnStartedEvent arg0) {
		// TODO Auto-generated method stub

	}

}
